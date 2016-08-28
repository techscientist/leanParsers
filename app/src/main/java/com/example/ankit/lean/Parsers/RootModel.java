import java.util.ArrayList;

class RootModel {

	public String logo;
	public CreatorModel _creator;
	public int id;
	public String code_of_conduct;
	public String privacy;
	public String type;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String location_name;
	public String topic;
	public String background_image;
	public String timezone;
	public String email;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String name;
	public String organizer_name;
	public String organizer_description;
	public String state;

	public RootModel(String logo, CreatorModel creator, int id, String code_of_conduct, String privacy, String type, String description, Call_for_papersModel call_for_papers, String end_time, String location_name, String topic, String background_image, String timezone, String email, VersionModel version, CopyrightModel copyright, String schedule_published_on, ArrayList<Social_linksModel> social_links, String start_time, String name, String organizer_name, String organizer_description, String state) {

		this.logo = logo;
		this._creator = creator;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.type = type;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.timezone = timezone;
		this.email = email;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.start_time = start_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.state = state;

	}

}