import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String privacy;
	public String email;
	public String topic;
	public String organizer_description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String type;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String location_name;
	public String organizer_name;
	public String name;
	public String background_image;
	public String timezone;
	public String start_time;
	public String logo;

	public RootModel(String end_time, String schedule_published_on, String code_of_conduct, String privacy, String email, String topic, String organizer_description, VersionModel version, Call_for_papersModel call_for_papers, int id, CopyrightModel copyright, CreatorModel creator, String type, String description, ArrayList<Social_linksModel> social_links, String state, String location_name, String organizer_name, String name, String background_image, String timezone, String start_time, String logo) {

		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.email = email;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._copyright = copyright;
		this._creator = creator;
		this.type = type;
		this.description = description;
		this.social_links = social_links;
		this.state = state;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.start_time = start_time;
		this.logo = logo;

	}

}