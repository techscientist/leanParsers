import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public String type;
	public String email;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String privacy;
	public String name;
	public VersionModel _version;
	public String start_time;
	public String organizer_description;
	public String location_name;
	public String background_image;
	public String organizer_name;
	public int id;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String topic;
	public String timezone;
	public String description;

	public RootModel(String end_time, String code_of_conduct, String type, String email, CopyrightModel copyright, String schedule_published_on, ArrayList<Social_linksModel> social_links, CreatorModel creator, String privacy, String name, VersionModel version, String start_time, String organizer_description, String location_name, String background_image, String organizer_name, int id, String state, Call_for_papersModel call_for_papers, String logo, String topic, String timezone, String description) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.email = email;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._creator = creator;
		this.privacy = privacy;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.id = id;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this.description = description;

	}

}