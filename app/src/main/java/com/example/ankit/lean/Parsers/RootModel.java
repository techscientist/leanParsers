import java.util.ArrayList;

class RootModel {

	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String end_time;
	public String state;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String logo;
	public CreatorModel _creator;
	public String topic;
	public String privacy;
	public String name;
	public String start_time;
	public String timezone;
	public String location_name;
	public String organizer_description;
	public int id;
	public String type;
	public String description;
	public String schedule_published_on;

	public RootModel(String background_image, Call_for_papersModel call_for_papers, String code_of_conduct, String organizer_name, CopyrightModel copyright, String end_time, String state, String email, ArrayList<Social_linksModel> social_links, VersionModel version, String logo, CreatorModel creator, String topic, String privacy, String name, String start_time, String timezone, String location_name, String organizer_description, int id, String type, String description, String schedule_published_on) {

		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.state = state;
		this.email = email;
		this.social_links = social_links;
		this._version = version;
		this.logo = logo;
		this._creator = creator;
		this.topic = topic;
		this.privacy = privacy;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.type = type;
		this.description = description;
		this.schedule_published_on = schedule_published_on;

	}

}