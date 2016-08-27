import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String start_time;
	public String background_image;
	public CreatorModel _creator;
	public String name;
	public String end_time;
	public String type;
	public String schedule_published_on;
	public String state;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String logo;

	public RootModel(String email, String organizer_description, Call_for_papersModel call_for_papers, int id, String start_time, String background_image, CreatorModel creator, String name, String end_time, String type, String schedule_published_on, String state, CopyrightModel copyright, String description, String code_of_conduct, String topic, String location_name, String privacy, VersionModel version, String organizer_name, String timezone, ArrayList<Social_linksModel> social_links, String logo) {

		this.email = email;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.start_time = start_time;
		this.background_image = background_image;
		this._creator = creator;
		this.name = name;
		this.end_time = end_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.social_links = social_links;
		this.logo = logo;

	}

}