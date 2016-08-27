import java.util.ArrayList;

class RootModel {

	public String state;
	public String location_name;
	public String type;
	public String logo;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String end_time;
	public String organizer_description;
	public String schedule_published_on;
	public String privacy;
	public String description;
	public VersionModel _version;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String background_image;
	public String start_time;
	public String organizer_name;
	public String timezone;
	public String topic;
	public CreatorModel _creator;

	public RootModel(String state, String location_name, String type, String logo, int id, Call_for_papersModel call_for_papers, String email, String end_time, String organizer_description, String schedule_published_on, String privacy, String description, VersionModel version, String name, ArrayList<Social_linksModel> social_links, String code_of_conduct, CopyrightModel copyright, String background_image, String start_time, String organizer_name, String timezone, String topic, CreatorModel creator) {

		this.state = state;
		this.location_name = location_name;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.description = description;
		this._version = version;
		this.name = name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.background_image = background_image;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this._creator = creator;

	}

}