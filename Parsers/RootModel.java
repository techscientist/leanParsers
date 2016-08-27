import java.util.ArrayList;

class RootModel {

	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String start_time;
	public String privacy;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String organizer_description;
	public int id;
	public String timezone;
	public CopyrightModel _copyright;
	public String name;
	public String end_time;
	public String code_of_conduct;
	public String description;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String state;
	public String topic;
	public String organizer_name;
	public String logo;

	public RootModel(String email, ArrayList<Social_linksModel> social_links, String schedule_published_on, String start_time, String privacy, CreatorModel creator, String background_image, String type, String organizer_description, int id, String timezone, CopyrightModel copyright, String name, String end_time, String code_of_conduct, String description, String location_name, Call_for_papersModel call_for_papers, VersionModel version, String state, String topic, String organizer_name, String logo) {

		this.email = email;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.privacy = privacy;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.id = id;
		this.timezone = timezone;
		this._copyright = copyright;
		this.name = name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.state = state;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.logo = logo;

	}

}